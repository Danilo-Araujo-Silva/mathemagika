package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Raster
 *
 * Full name:        System`Raster
 *
 *                   Raster[{{a  , a  , …}, …}] is a two-dimensional graphics primitive which represents a rectangular array of gray cells.
 *                             11   12
 *                   Raster[{{{r  , g  , b  }, …}, …}] represents an array of RGB color cells.
 *                              11   11   11
 *                   Raster[{{{r  , g  , b  , α  }, …}, …}] represents an array of color cells with opacity α  .
 *                              11   11   11   11                                                            ij
 *                   Raster[{{{a  , α  }, …}, …}] represents an array of gray cells with the specified opacities.
 * Usage:                       11   11
 *
 *                   ColorFunction -> Automatic
 * Options:          ColorFunctionScaling -> True
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Raster
 * Documentation:    web: http://reference.wolfram.com/language/ref/Raster.html
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
fun raster(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Raster", arguments.toMutableList(), options)
}
