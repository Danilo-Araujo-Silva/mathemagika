package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             PopupMenu
 *
 * Full name:        System`PopupMenu
 *
 *                   PopupMenu[x, {val , val , …}] represents a popup menu with setting x and possible values val .
 *                                    1     2                                                                    i
 *                   PopupMenu[Dynamic[x], {val , …}] takes the setting to be the dynamically updated current value of x, with the value of x being reset every time an item is selected from the menu.
 *                                             1
 *                   PopupMenu[x, {val   lbl , val   lbl , …}] represents a popup menu in which possible value val  is indicated by lbl .
 *                                    1      1     2      2                                                         i                    i
 *                   PopupMenu[x, {val   lbl , …}, dlbl] displays the menu item as dlbl if x is none of the val .
 *                                    1      1                                                                  i
 * Usage:            PopupMenu[x, {…}, dlbl, base] displays as base when it is not being clicked.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> PopupMenu
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
 *                   local: paclet:ref/PopupMenu
 * Documentation:    web: http://reference.wolfram.com/language/ref/PopupMenu.html
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
fun popupMenu(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("PopupMenu", arguments.toMutableList(), options)
}
