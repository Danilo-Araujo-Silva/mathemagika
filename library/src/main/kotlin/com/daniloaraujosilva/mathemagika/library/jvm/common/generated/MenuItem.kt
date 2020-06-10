package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MenuItem
 * 
 * Full name:        System`MenuItem
 * 
 * Usage:            System`MenuItem
 * 
 * Options:          None
 * 
 *                   HoldRest
 * Attributes:       Protected
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 * 
 * Definitions:      MenuItem[RobotTools`Menu`Private`tabbedName_String /; StringMatchQ[RobotTools`Menu`Private`tabbedName, __~~"\t"~~__], RobotTools`Menu`Private`args__] := Module[{RobotTools`Menu`Private`name, RobotTools`Menu`Private`keyString, RobotTools`Menu`Private`keys}, {RobotTools`Menu`Private`name, RobotTools`Menu`Private`keyString} = RobotTools`Menu`Private`tabSplit[RobotTools`Menu`Private`tabbedName]; RobotTools`Menu`Private`keys = RobotTools`Menu`Private`plusSplit[RobotTools`Menu`Private`keyString] /. RobotTools`Menu`Private`$frontEndModifierKeys /. RobotTools`Package`$mkSymbolToStringRules; With[{RobotTools`Menu`Private`name = RobotTools`Menu`Private`name, RobotTools`Menu`Private`menuKey = FrontEnd`MenuKey[Last[RobotTools`Menu`Private`keys], FrontEnd`Modifiers -> Reverse[Most[RobotTools`Menu`Private`keys]]]}, MenuItem[RobotTools`Menu`Private`name, RobotTools`Menu`Private`args, RobotTools`Menu`Private`menuKey]]]
 * 
 * Own values:       None
 * 
 * Down values:      MenuItem[RobotTools`Menu`Private`tabbedName_String /; StringMatchQ[RobotTools`Menu`Private`tabbedName, __~~"\t"~~__], RobotTools`Menu`Private`args__] := Module[{RobotTools`Menu`Private`name, RobotTools`Menu`Private`keyString, RobotTools`Menu`Private`keys}, {RobotTools`Menu`Private`name, RobotTools`Menu`Private`keyString} = RobotTools`Menu`Private`tabSplit[RobotTools`Menu`Private`tabbedName]; RobotTools`Menu`Private`keys = RobotTools`Menu`Private`plusSplit[RobotTools`Menu`Private`keyString] /. RobotTools`Menu`Private`$frontEndModifierKeys /. RobotTools`Package`$mkSymbolToStringRules; With[{RobotTools`Menu`Private`name = RobotTools`Menu`Private`name, RobotTools`Menu`Private`menuKey = FrontEnd`MenuKey[Last[RobotTools`Menu`Private`keys], FrontEnd`Modifiers -> Reverse[Most[RobotTools`Menu`Private`keys]]]}, MenuItem[RobotTools`Menu`Private`name, RobotTools`Menu`Private`args, RobotTools`Menu`Private`menuKey]]]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun menuItem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MenuItem", arguments.toMutableList(), options)
}
