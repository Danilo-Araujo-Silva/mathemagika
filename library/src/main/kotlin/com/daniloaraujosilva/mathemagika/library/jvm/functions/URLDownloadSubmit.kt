package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLDownloadSubmit
 *
 * Full name:        System`URLDownloadSubmit
 *
 *                   URLDownloadSubmit[url, file] submits the specified URL to be downloaded asynchronously to the file given.
 *                   URLDownloadSubmit[url, file, {param   val , param   val , …}] submits the specified URL, adding elements with names param  and values val .
 *                                                      1      1       2      2                                                                 i               i
 *                   URLDownloadSubmit[obj, …] submits the cloud object obj.
 * Usage:            URLDownloadSubmit[HTTPRequest[…], …] submits the specified HTTP request.
 *
 *                   Authentication -> Automatic
 *                   CharacterEncoding -> Automatic
 *                   ConnectionSettings -> <|MaxUploadSpeed -> Automatic, MaxDownloadSpeed -> Automatic|>
 *                   CookieFunction -> Automatic
 *                   FollowRedirects -> True
 *                   HandlerFunctions -> <||>
 *                   HandlerFunctionsKeys -> Automatic
 *                   Interactive -> False
 *                   TimeConstraint -> Infinity
 * Options:          VerifySecurityCertificates -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLDownloadSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLDownloadSubmit.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun uRLDownloadSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLDownloadSubmit", arguments.toMutableList(), options)
}
