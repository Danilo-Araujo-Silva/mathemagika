package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Infix
 *
 * Full name:        System`Infix
 *
 *                   Infix[f[e , e , …]] prints with f[e , e , …] given in default infix form: e  ~ f ~ e  ~ f ~ e  ….
 *                            1   2                     1   2                                   1        2        3
 *                   Infix[expr, h] prints with arguments separated by h: e  h e  h e  ….
 * Usage:                                                                  1    2    3
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Infix
 * Documentation:    web: http://reference.wolfram.com/language/ref/Infix.html
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
fun `infix`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Infix", arguments.toMutableList(), options)
}
