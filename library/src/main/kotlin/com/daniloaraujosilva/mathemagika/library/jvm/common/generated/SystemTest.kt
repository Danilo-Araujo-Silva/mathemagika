package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             SystemTest
 * 
 * Full name:        System`SystemTest
 * 
 * Usage:            System`SystemTest
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
 * 
 *                   SystemTest[] := SystemTest`Private`systemTest[]
 *                   SystemTest["Properties"] := {"Network", "FileSystem", "Devices", "Links", "Services", "ImportExport"}
 * Definitions:      SystemTest[SystemTest`Private`keys_] := SystemTest`Private`systemTest[SystemTest`Private`keys]
 * 
 * Own values:       None
 * 
 *                   SystemTest[] := SystemTest`Private`systemTest[]
 *                   SystemTest["Properties"] := {"Network", "FileSystem", "Devices", "Links", "Services", "ImportExport"}
 * Down values:      SystemTest[SystemTest`Private`keys_] := SystemTest`Private`systemTest[SystemTest`Private`keys]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun systemTest(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SystemTest", arguments.toMutableList(), options)
}
