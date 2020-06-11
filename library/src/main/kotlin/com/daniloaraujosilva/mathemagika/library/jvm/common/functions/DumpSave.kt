package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DumpSave
 *
 * Full name:        System`DumpSave
 *
 *                   DumpSave["file.mx", symbol] writes definitions associated with a symbol to a file in internal Wolfram System format.
 *                   DumpSave["file.mx", "context`"] writes out definitions associated with all symbols in the specified context.
 *                   DumpSave["file.mx", {object , object , …}] writes out definitions for several symbols or contexts.
 *                                              1        2
 * Usage:            DumpSave["package`", objects] chooses the name of the output file based on the computer system used.
 *
 *                   CompressionLevel -> 1
 * Options:          SymbolAttributes -> True
 *
 *                   HoldRest
 * Attributes:       Protected
 *
 *                   local: paclet:ref/DumpSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/DumpSave.html
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
fun dumpSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DumpSave", arguments.toMutableList(), options)
}
