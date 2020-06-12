package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Options
 *
 * Full name:        System`Options
 *
 *                   Options[symbol] gives the list of default options assigned to a symbol.
 *                   Options[expr] gives the options explicitly specified in a particular expression such as a graphics object.
 *                   Options[stream] or Options["sname"] gives options associated with a particular stream.
 *                   Options[object] gives options associated with an external object such as a NotebookObject or CloudObject.
 *                   Options[obj, name] gives the setting for the option name.
 *                   Options[obj, {name , name , …}] gives a list of the settings for the options name .
 * Usage:                              1      2                                                       i
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/Options
 * Documentation:    web: http://reference.wolfram.com/language/ref/Options.html
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
fun options(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Options", arguments.toMutableList(), options)
}
