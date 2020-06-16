package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             PopupView
 *
 * Full name:        System`PopupView
 *
 *                   PopupView[{expr , expr , …}] represents an object which displays as a popup menu whose items are the expr .
 *                                  1      2                                                                                  i
 *                                                               th
 *                   PopupView[{expr , expr , …}, i] makes the i   entry be the one currently chosen.
 *                                  1      2
 *                   PopupView[{expr , expr , …}, i, base] displays as base if it is not being clicked.
 * Usage:                           1      2
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Baseline
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> PopupView
 *                   DefaultMenuStyle -> PopupMenuLabel
 *                   Enabled -> Automatic
 *                   FieldSize -> {{1., 50.}, {1., 10.}}
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> All
 *                   MenuAppearance -> {Automatic, Automatic}
 * Options:          MenuStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/PopupView
 * Documentation:    web: http://reference.wolfram.com/language/ref/PopupView.html
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
fun popupView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PopupView", arguments.toMutableList(), options)
}
