@EHO OFF
ECHO Copying DLL ...
XCOPY /Y ..\BIN\DocuSignSignature_SourceCode.dll .\80\BIN\
ECHO Copying ASCX files ...
XCOPY /Y ..\*.ascx .\12\TEMPLATE\CONTROLTEMPLATES\DocuSignSignature_SourceCode\
ECHO Building WSP ...
..\WSPBuilder\WSPBuilder.exe -WSPName DocuSignSignature_SourceCode.wsp -BuildCAS false -SolutionID 77c28381-5ff4-481f-852c-eb9f8653270d
ECHO Copying WSP file ...
XCOPY /Y .\DocuSignSignature_SourceCode.wsp ..\SETUP\