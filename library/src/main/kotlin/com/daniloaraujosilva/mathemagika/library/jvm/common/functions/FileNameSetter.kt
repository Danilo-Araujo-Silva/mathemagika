package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FileNameSetter
 *
 * Full name:        System`FileNameSetter
 *
 *                   FileNameSetter[name] represents a file name setter which displays as a Browse button and when clicked brings up a system file opening dialog, starting from the location corresponding to name.
 *                   FileNameSetter[Dynamic[name]] uses the dynamically updated current value of name, with the value of name being reset if a different file is chosen.
 *                   FileNameSetter[name, "Save"] brings up a file saving dialog.
 *                   FileNameSetter[name, "spec", {type   {patt  , patt  , …}, type   {…}, …}] looks for files of types type  with names matching the file patterns patt  .
 * Usage:                                              1        11      12          2                                         i                                           ij
 *
 *                   Appearance -> Automatic
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> FileNameSetter
 *                   Enabled -> Automatic
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   Method -> Automatic
 * Options:          WindowTitle -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FileNameSetter
 * Documentation:    web: http://reference.wolfram.com/language/ref/FileNameSetter.html
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
fun fileNameSetter(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FileNameSetter", arguments.toMutableList(), options)
}
