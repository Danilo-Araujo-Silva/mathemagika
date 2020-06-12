package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RegionProduct
 *
 * Full name:        System`RegionProduct
 *
 *                   RegionProduct[reg , reg ] represents the Cartesian product of the regions reg  and reg .
 *                                    1     2                                                     1        2
 *                   RegionProduct[reg , reg , …] represents the Cartesian product of the regions reg , reg , ….
 * Usage:                             1     2                                                        1     2
 *
 * Options:          None
 *
 *                   Flat
 *                   OneIdentity
 * Attributes:       Protected
 *
 *                   local: paclet:ref/RegionProduct
 * Documentation:    web: http://reference.wolfram.com/language/ref/RegionProduct.html
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
fun regionProduct(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RegionProduct", arguments.toMutableList(), options)
}
