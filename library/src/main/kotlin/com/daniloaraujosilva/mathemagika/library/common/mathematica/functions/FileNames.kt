package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileNames
 *
 * Full name:        System`FileNames
 *
 *                   FileNames[] lists all files in the current working directory.
 *                   FileNames[form] lists all files in the current working directory whose names match the string pattern form.
 *                   FileNames[{form , form , …}] lists all files whose names match any of the form .
 *                                  1      2                                                       i
 *                   FileNames[All, dir] lists all files in the directory dir.
 *                   FileNames[forms, {dir , dir , …}] lists files with names matching forms in any of the directories dir .
 *                                        1     2                                                                         i
 * Usage:            FileNames[forms, dirs, n] includes files that are in subdirectories up to n levels down.
 *
 * Options:          IgnoreCase -> Automatic
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/FileNames
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileNames.html
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
fun fileNames(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileNames", arguments.toMutableList(), options)
}
