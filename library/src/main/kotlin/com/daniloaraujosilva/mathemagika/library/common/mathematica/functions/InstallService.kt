package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             InstallService
 *
 * Full name:        System`InstallService
 *
 * Usage:            InstallService[wsdlURL] installs the web service operations specified in the WSDL URL into a default context defined by the service name and port name of the service operation.  InstallService[wsdlURL, myContext] installs the web service operations specified in the WSDL URL into a context specified by the second parameter.
 *
 *                   AllowShortContext -> True
 *                   SchemaAllowShortContext -> False
 *                   NamespaceContexts -> {}
 *                   SchemaContext -> Automatic
 *                   Username -> None
 *                   Password -> None
 * Options:          Timeout -> None
 *
 * Attributes:
 *
 *                   local: paclet:ref/InstallService
 * Documentation:    web: http://reference.wolfram.com/language/ref/InstallService.html
 *
 * Definitions:      InstallService[WebServices`Private`wsdlURL_String, WebServices`Private`context_String:"", (WebServices`Private`options___)?OptionQ] := Module[{WebServices`Private`result}, JLink`InstallJava[]; If[TrueQ[WebServices`Private`$PrintPerformanceNumbers], Print["Installing Service: ", Date[]]]; WebServices`Private`result = WebServices`Private`InstallWSDL[WebServices`Private`wsdlURL, WebServices`Private`context, WebServices`Private`options]; If[TrueQ[WebServices`Private`$PrintPerformanceNumbers], Print["Finished Installing Service: ", Date[]]]; WebServices`Private`result]
 *
 * Own values:       None
 *
 * Down values:      InstallService[WebServices`Private`wsdlURL_String, WebServices`Private`context_String:"", (WebServices`Private`options___)?OptionQ] := Module[{WebServices`Private`result}, JLink`InstallJava[]; If[TrueQ[WebServices`Private`$PrintPerformanceNumbers], Print["Installing Service: ", Date[]]]; WebServices`Private`result = WebServices`Private`InstallWSDL[WebServices`Private`wsdlURL, WebServices`Private`context, WebServices`Private`options]; If[TrueQ[WebServices`Private`$PrintPerformanceNumbers], Print["Finished Installing Service: ", Date[]]]; WebServices`Private`result]
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun installService(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InstallService", arguments.toMutableList(), options)
}
