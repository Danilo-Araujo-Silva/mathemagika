package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Rasterize
 * 
 * Full name:        System`Rasterize
 * 
 *                   Rasterize[expr] returns a rasterized version of the displayed form of expr.
 *                   Rasterize[expr, elem] gives the element elem associated with the rasterized form of expr. 
 *                   Rasterize[expr, {elem , elem , …}] gives a list of the specified elem .
 * Usage:                                 1      2                                        i
 * 
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   ImageFormattingWidth :> $ImageFormattingWidth
 *                   ImageResolution :> $ImageResolution
 *                   ImageSize -> Automatic
 * Options:          RasterSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Rasterize
 * Documentation:    web: http://reference.wolfram.com/language/ref/Rasterize.html
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
fun rasterize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Rasterize", arguments.toMutableList(), options)
}
