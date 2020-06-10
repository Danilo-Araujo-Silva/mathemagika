package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Labeled
 * 
 * Full name:        System`Labeled
 * 
 *                   Labeled[expr, lbl] displays expr labeled with lbl. 
 *                   Labeled[expr, lbl, pos] places lbl at a position specified by pos. 
 *                   Labeled[expr, {lbl , lbl , …}, {pos , …}] places the lbl  at positions pos . 
 *                                     1     2          1                    i                 i
 *                   Labeled[expr, {lbl , lbl , lbl , lbl }, All] places the lbl  at the bottom, left, top, and right, respectively. 
 * Usage:                              1     2     3     4                      i
 * 
 *                   Alignment -> {Center, Baseline}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentSize -> Automatic
 *                   DefaultBaseStyle -> Labeled
 *                   DefaultLabelStyle -> LabeledLabel
 *                   Editable -> Automatic
 *                   Frame -> None
 *                   FrameMargins -> 0
 *                   FrameStyle -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   RotateLabel -> False
 *                   RoundingRadius -> 0
 *                   Selectable -> Automatic
 *                   Spacings -> Automatic
 * Options:          SyntaxForm -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Labeled
 * Documentation:    web: http://reference.wolfram.com/language/ref/Labeled.html
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
fun labeled(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Labeled", arguments.toMutableList(), options)
}
