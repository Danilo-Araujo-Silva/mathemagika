package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Epilog
 *
 * Full name:        System`Epilog
 *
 * Usage:            Epilog is an option for graphics functions that gives a list of graphics primitives to be rendered after the main part of the graphics is rendered.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Epilog
 * Documentation:    web: http://reference.wolfram.com/language/ref/Epilog.html
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
fun epilog(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Epilog", arguments.toMutableList(), options)
}
