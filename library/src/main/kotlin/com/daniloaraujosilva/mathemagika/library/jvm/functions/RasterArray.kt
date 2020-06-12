package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             RasterArray
 *
 * Full name:        System`RasterArray
 *
 *                   RasterArray[{{g  , g  , …}, …}] is a two-dimensional graphics primitive that represents a rectangular array of cells colored according to the graphics directives g  .
 * Usage:                           11   12                                                                                                                                             ij
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/RasterArray
 * Documentation:    web: http://reference.wolfram.com/language/ref/RasterArray.html
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
fun rasterArray(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RasterArray", arguments.toMutableList(), options)
}
