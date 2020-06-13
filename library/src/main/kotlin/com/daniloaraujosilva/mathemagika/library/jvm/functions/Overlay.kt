package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             Overlay
 *
 * Full name:        System`Overlay
 *
 *                   Overlay[{expr , expr , …}] displays as an overlay of all the expr .
 *                                1      2                                            i
 *                   Overlay[{expr , expr , …}, {i, j, …}] displays as an overlay of expr , expr , ….
 *                                1      2                                               i      j
 *                   Overlay[{expr , expr , …}, {i, j, …}, s] allows selections to be made and controls to be clicked in expr .
 * Usage:                         1      2                                                                                   s
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> Overlay
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Overlay
 * Documentation:    web: http://reference.wolfram.com/language/ref/Overlay.html
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
fun overlay(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Overlay", arguments.toMutableList(), options)
}
