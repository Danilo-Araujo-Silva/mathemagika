package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FileSystemMap
 *
 * Full name:        System`FileSystemMap
 *
 *                   FileSystemMap[f, root] gives an association whose keys are the names of files in root, and whose values are the results of applying f to the full names of these files.
 *                   FileSystemMap[f, root, n] gives a nested association in which subdirectories down to level n are represented by an association.
 *                   FileSystemMap[f, root, {m, n}] gives a nested association including files in subdirectories from level m down through n.
 * Usage:            FileSystemMap[f, root, lev, r] combines levels to give a nested output association with r levels.
 *
 *                   FileNameForms -> All
 *                   IncludeDirectories -> False
 * Options:          MaxItems -> Infinity
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileSystemMap
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileSystemMap.html
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
fun fileSystemMap(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileSystemMap", arguments.toMutableList(), options)
}
