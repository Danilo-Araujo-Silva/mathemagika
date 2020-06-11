package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FlipView
 *
 * Full name:        System`FlipView
 *
 *                   FlipView[{expr , expr }] represents an object which flips between displaying expr  and expr  each time it is clicked.
 *                                 1      2                                                           1         2
 *                   FlipView[{expr , expr , …}] cyclically flips through successive expr .
 *                                 1      2                                              i
 *                   FlipView[{expr , expr , …}, i] makes expr  be the object currently displayed.
 * Usage:                          1      2                   i
 *
 *                   Alignment -> Automatic
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> FlipView
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FlipView
 * Documentation:    web: http://reference.wolfram.com/language/ref/FlipView.html
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
fun flipView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FlipView", arguments.toMutableList(), options)
}
