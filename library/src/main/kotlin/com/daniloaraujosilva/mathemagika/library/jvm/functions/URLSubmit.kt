package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLSubmit
 *
 * Full name:        System`URLSubmit
 *
 *                   URLSubmit[url] submits the specified URL to be executed asynchronously.
 *                   URLSubmit[url, {param   val , param   val , …}] submits the specified URL, adding elements with names param  and values val .
 *                                        1      1       2      2                                                                 i               i
 *                   URLSubmit[obj, …] submits the cloud object obj.
 * Usage:            URLSubmit[HTTPRequest[…], …] submits the specified HTTP request.
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
 *                   local: paclet:ref/URLSubmit
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLSubmit.html
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
fun uRLSubmit(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLSubmit", arguments.toMutableList(), options)
}
