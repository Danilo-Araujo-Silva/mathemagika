package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NumberCompose
 *
 * Full name:        System`NumberCompose
 *
 *                   NumberCompose[{c , …, c }, {u , …, u }] returns the quantity c  u  + … + c  u .
 * Usage:                            1      n     1      n                         1  1        n  n
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NumberCompose
 * Documentation:    web: http://reference.wolfram.com/language/ref/NumberCompose.html
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
fun numberCompose(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NumberCompose", arguments.toMutableList(), options)
}
