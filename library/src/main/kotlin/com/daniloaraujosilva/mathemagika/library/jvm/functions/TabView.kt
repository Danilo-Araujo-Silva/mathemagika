package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             TabView
 *
 * Full name:        System`TabView
 *
 *                   TabView[{lbl   expr , lbl   expr , …}] represents an object in which clicking the tab with label lbl  displays expr .
 *                               1       1     2       2                                                                   i              i
 *                                                                           th
 *                   TabView[{lbl   expr , lbl   expr , …}, i] makes the i   tab be the one currently selected.
 *                               1       1     2       2
 *                   TabView[{{v , lbl   expr }, {v , lbl   expr }, …}, v] associates values v  with successive tabs, and makes the tab with value v be the one currently selected.
 *                              1     1       1     2     2       2                             i
 *                   TabView[{expr , expr , …}] takes the tab labels to be successive integers.
 * Usage:                         1      2
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   ControlPlacement -> {Automatic, Automatic}
 *                   DefaultBaseStyle -> TabView
 *                   DefaultLabelStyle -> TabViewLabel
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> All
 * Options:          LabelStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TabView
 * Documentation:    web: http://reference.wolfram.com/language/ref/TabView.html
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
fun tabView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TabView", arguments.toMutableList(), options)
}
