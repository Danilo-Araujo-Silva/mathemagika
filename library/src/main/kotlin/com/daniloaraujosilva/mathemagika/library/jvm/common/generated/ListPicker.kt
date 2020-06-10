package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ListPicker
 * 
 * Full name:        System`ListPicker
 * 
 *                   ListPicker[list, {val , val , …}] represents a list pane with setting list that can contain possible values val .
 *                                        1     2                                                                                   i
 *                   ListPicker[Dynamic[list], {val , …}] takes the setting to be the dynamically updated current value of list, with members added or removed each time an item is selected or deselected.
 *                                                 1
 *                   ListPicker[list, {val   lbl , val   lbl , …}] represents a list pane in which the possible value val  is indicated by lbl .
 * Usage:                                 1      1     2      2                                                            i                    i
 * 
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AppearanceElements -> None
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> ListPicker
 *                   Enabled -> Automatic
 *                   FieldSize -> {{1., 50.}, {1., 10.}}
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   Multiselection -> True
 *                   Scrollbars -> Automatic
 *                   ScrollPosition -> {0, 0}
 * Options:          Spacings -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ListPicker
 * Documentation:    web: http://reference.wolfram.com/language/ref/ListPicker.html
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
fun listPicker(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ListPicker", arguments.toMutableList(), options)
}
