package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             DOSTextFormat
 *
 * Full name:        System`DOSTextFormat
 *
 * Usage:            DOSTextFormat is an option for OpenRead, OpenWrite, and OpenAppend that specifies whether files should be opened in text mode. With DOSTextFormat -> True, Mathematica uses the normal text format for the type of computer on which Mathematica is running. Text mode typically entails translation of a text file's line-ending characters into the newline character "\n". With DOSTextFormat -> False, files are opened in "binary mode", in which no such translation is performed. On some systems, there is no difference between text mode and binary mode.
 *
 * Options:          None
 *
 * Attributes:       Protected
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
fun dOSTextFormat(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DOSTextFormat", arguments.toMutableList(), options)
}
