package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             URLResponseTime
 *
 * Full name:        System`URLResponseTime
 *
 *                   URLResponseTime[url] gives the total number of seconds to request one byte from the specified URL.
 * Usage:            URLResponseTime[url, prop] gives the specified timing.
 *
 *                   TimeConstraint -> 60
 *                   Username ->
 *                   Password ->
 *                   FollowRedirects -> True
 * Options:          VerifySecurityCertificates -> True
 *
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/URLResponseTime
 * Documentation:    web: http://reference.wolfram.com/language/ref/URLResponseTime.html
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
fun uRLResponseTime(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("URLResponseTime", arguments.toMutableList(), options)
}
