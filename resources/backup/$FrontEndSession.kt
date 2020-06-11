package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             $FrontEndSession
 *
 * Full name:        System`$FrontEndSession
 *
 * Usage:            $FrontEndSession is a global symbol that represents the current session of the front end from which the kernel is being run.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/$FrontEndSession
 * Documentation:    web: http://reference.wolfram.com/language/ref/$FrontEndSession.html
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
fun `$FrontEndSession`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$FrontEndSession", arguments.toMutableList(), options)
}
