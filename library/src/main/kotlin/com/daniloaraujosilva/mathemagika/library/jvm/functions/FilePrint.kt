package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             FilePrint
 *
 * Full name:        System`FilePrint
 *
 *                   FilePrint["file"] prints out the raw textual contents of file.
 *                   FilePrint["file", n] prints out the first n raw textual lines of file.
 *                   FilePrint["file", -n] prints out the last n raw textual lines of file.
 *                   FilePrint["file", m;;n] prints out lines m through n of file.
 * Usage:            FilePrint["file", m;;n;;s] prints out lines m through n of file in steps of s.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FilePrint
 * Documentation:    web: http://reference.wolfram.com/language/ref/FilePrint.html
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
fun filePrint(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FilePrint", arguments.toMutableList(), options)
}
