package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MenuView
 * 
 * Full name:        System`MenuView
 * 
 *                   MenuView[{lbl   expr , lbl   expr , …}] represents an object in which selecting the menu item with label lbl  displays expr . 
 *                                1       1     2       2                                                                          i              i
 *                                                                            th
 *                   MenuView[{lbl   expr , lbl   expr , …}, i] makes the i   item be the one currently selected.
 *                                1       1     2       2
 *                   MenuView[{{v , lbl   expr }, {v , lbl   expr }, …}, v] associates values v  with successive menu items, and makes the item with value v be the one currently selected. 
 *                               1     1       1     2     2       2                             i
 *                   MenuView[{expr , expr , …}] takes the menu items' labels to be successive integers.
 * Usage:                          1      2
 * 
 *                   Alignment -> {Left, Top}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ControlPlacement -> {Top, Left}
 *                   DefaultBaseStyle -> MenuView
 *                   DefaultLabelStyle -> MenuViewLabel
 *                   Deployed -> False
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> Automatic
 *                   ImageSize -> All
 *                   LabelStyle -> {}
 *                   TransitionDirection -> Horizontal
 *                   TransitionDuration -> 0.5
 * Options:          TransitionEffect -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/MenuView
 * Documentation:    web: http://reference.wolfram.com/language/ref/MenuView.html
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
fun menuView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MenuView", arguments.toMutableList(), options)
}
