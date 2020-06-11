package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             SetCloudDirectory
 *
 * Full name:        System`SetCloudDirectory
 *
 *                   SetCloudDirectory[dir] sets the current working directory used for cloud objects to dir.
 * Usage:            SetCloudDirectory[] sets the current working directory for cloud objects to $CloudRootDirectory.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SetCloudDirectory
 * Documentation:    web: http://reference.wolfram.com/language/ref/SetCloudDirectory.html
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
fun setCloudDirectory(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SetCloudDirectory", arguments.toMutableList(), options)
}
