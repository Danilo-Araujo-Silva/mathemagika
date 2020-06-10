package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RandomColor
 * 
 * Full name:        System`RandomColor
 * 
 *                   RandomColor[] gives a pseudorandom color directive in the RGBColor space.
 *                   RandomColor[n] gives n pseudorandom colors.
 *                   RandomColor[model] gives a color from the specified model.
 *                   RandomColor[model, n] gives n colors.
 *                   RandomColor[model, {n , n , …}] gives an array of colors.
 * Usage:                                 1   2
 * 
 * Options:          ColorSpace -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/RandomColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/RandomColor.html
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
fun randomColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RandomColor", arguments.toMutableList(), options)
}
