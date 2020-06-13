package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CloudObjectInformation
 *
 * Full name:        System`CloudObjectInformation
 *
 *                   CloudObjectInformation[obj] gives information about a cloud object.
 *                   CloudObjectInformation[{obj, ...}] gives information about a list of objects.
 *                   CloudObjectInformation[obj, "field"] gives the information for a specific field.
 *                   CloudObjectInformation[obj, {field, ...}] limits the information to a selection of fields.
 *                   CloudObjectInformation[{obj, ...}, {field, ...}] gets a selection of information for a list of objects.
 *                   CloudObjectInformation[dir, "DirectoryLevel" -> 0] gives information about a directory. (This is the default.)
 *                   CloudObjectInformation[dir, "DirectoryLevel" -> 1] gives information about all objects in a given directory (but not in subdirectories).
 *                   CloudObjectInformation[dir, "DirectoryLevel" -> Infinity] gives information about all objects in a given directory subtree.
 *                   CloudObjectInformation[type, {field, ...}] gives information about all objects of a given MIME type.
 * Usage:            CloudObjectInformation[type, field] gives a specific field of information about all objects of a given MIME type.
 *
 * Options:          DirectoryLevel -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun cloudObjectInformation(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CloudObjectInformation", arguments.toMutableList(), options)
}
