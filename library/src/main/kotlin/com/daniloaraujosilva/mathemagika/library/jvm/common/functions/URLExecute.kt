package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLExecute
 *
 * Full name:        System`URLExecute
 *
 *                   URLExecute[url] executes the specified URL, importing whatever result is generated.
 *                   URLExecute[url, {param   val , param   val , …}] executes the specified URL, adding elements with names param  and values val .
 *                                         1      1       2      2                                                                  i               i
 *                   URLExecute[url, params, format] imports the result using the specified format.
 *                   URLExecute[CloudObject[…], …] executes a cloud object with current authentication settings.
 * Usage:            URLExecute[HTTPRequest[…], …] executes the specified HTTP request.
 *
 *                   Authentication -> Automatic
 *                   CharacterEncoding -> Automatic
 *                   ConnectionSettings -> <|MaxUploadSpeed -> Automatic, MaxDownloadSpeed -> Automatic|>
 *                   CookieFunction -> Automatic
 *                   FollowRedirects -> True
 *                   Interactive -> True
 *                   TimeConstraint -> Infinity
 * Options:          VerifySecurityCertificates -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLExecute
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLExecute.html
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
fun uRLExecute(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLExecute", arguments.toMutableList(), options)
}
