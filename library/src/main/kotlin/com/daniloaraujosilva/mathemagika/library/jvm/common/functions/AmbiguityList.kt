package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             AmbiguityList
 *
 * Full name:        System`AmbiguityList
 *
 *                   AmbiguityList[{expr , expr , …}] represents possible results derived from an ambiguous semantic interpretation.
 *                                      1      2
 *                   AmbiguityList[{expr , expr , …}, "string"] represents possible results from semantic interpretation of an input string.
 *                                      1      2
 *                   AmbiguityList[{expr , expr , …}, "string", {assoc , assoc , …}] includes a sequence of associations giving details of the interpretations used to obtain the expr .
 * Usage:                               1      2                      1       2                                                                                                       i
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AmbiguityList
 * Documentation:    web: http://reference.wolfram.com/language/ref/AmbiguityList.html
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
fun ambiguityList(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AmbiguityList", arguments.toMutableList(), options)
}
