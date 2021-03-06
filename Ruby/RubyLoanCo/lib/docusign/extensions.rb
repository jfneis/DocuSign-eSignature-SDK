# AutoCamelize
#
# This module enables a class to automatically map
# Ruby-esque snake_case method calls to the equivalent
# camelCase calls. If a method with a camelCase equivalent
# is found, we alias the snake_case method on the
# class, to avoid tripping method_missing for the same
# method in the future.

module AutoCamelize
  def method_missing(method_name, *args, &block)
    ds_name = ds_equivalent(method_name)

    if ds_name && respond_to?(ds_name)
      self.class.class_eval %Q{
        def #{method_name}(*args, &block)
          send "#{ds_name}", *args, &block
        end
      }

      send method_name, *args, &block
    else
      super
    end
  end
  
  # Find the equivalent built-in method name, if there is one.
  # Example:
  # ds_equivalent('pdf_bytes') => 'pDFBytes'
  
  def ds_equivalent(string)
    string = string.to_s.camelize(:lower)
    methods.find { |m| m.downcase == string.downcase }
  end
end

Docusign.constants.each do |c|
  constant = Docusign.const_get c 
  if constant.is_a? Class
    constant.send :include, AutoCamelize
    constant.extend AutoCamelize
    
    # Map iD to id, to avoid confusion
    constant.class_eval do
      def id
        if respond_to?(:iD)
          iD
        else
          super
        end
      end
    end
  end
end