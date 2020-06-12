package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             ListZTransform
 *
 * Full name:        System`ListZTransform
 *
 *                   ListZTransform[list, z] gives the Z transform of list as a function of z.
 *                   ListZTransform[list, z, k] places the first element of list at integer time k on the infinite time axis.
 *                   ListZTransform[list, {z , z , …}, {k , k , …}] gives the multidimensional Z transform.
 * Usage:                                   1   2        1   2
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ListZTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListZTransform.html
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
fun listZTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListZTransform", arguments.toMutableList(), options)
}
