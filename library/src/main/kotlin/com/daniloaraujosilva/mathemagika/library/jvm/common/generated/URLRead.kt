package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             URLRead
 * 
 * Full name:        System`URLRead
 * 
 *                   URLRead[url] sends a request to a URL and reads back the response, returning it as a response object.
 *                   URLRead[assoc] sends a request to a URL built from an association of components and metadata elements.
 *                   URLRead[HTTPRequest[…]] sends a request specified by a symbolic HTTPRequest object.
 *                   URLRead[req, "elem"] returns only the element elem from the response.
 *                   URLRead[req, {elem , elem , …}] returns an association of the values of the elements elem .
 *                                     1      2                                                               i
 *                   URLRead[{req , req , …}, …] sends the requests req  in parallel, giving a list of the results obtained.
 * Usage:                        1     2                               i
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
 *                   local: paclet:ref/URLRead
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLRead.html
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
fun uRLRead(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLRead", arguments.toMutableList(), options)
}
