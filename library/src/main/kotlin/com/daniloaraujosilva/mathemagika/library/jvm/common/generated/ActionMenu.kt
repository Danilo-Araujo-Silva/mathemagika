package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             ActionMenu
 * 
 * Full name:        System`ActionMenu
 * 
 *                   ActionMenu[name, {lbl  :> act , lbl  :> act , …}] represents an action menu with label name and with items labeled lbl  that evaluates the expression act  if the corresponding item is chosen.
 * Usage:                                 1       1     2       2                                                                          i                                  i
 * 
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> ActionMenu
 *                   DefaultMenuStyle -> ActionMenuLabel
 *                   Enabled -> Automatic
 *                   Evaluator -> Automatic
 *                   FieldSize -> {{0, 50}, {0, 10}}
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   MenuAppearance -> {Automatic, Automatic}
 *                   MenuStyle -> {}
 * Options:          Method -> Preemptive
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/ActionMenu
 * Documentation:    web: http://reference.wolfram.com/language/ref/ActionMenu.html
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
fun actionMenu(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ActionMenu", arguments.toMutableList(), options)
}
