package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MetaCharacters
 *
 * Full name:        System`MetaCharacters
 *
 *                   MetaCharacters is an option to StringPosition. With MetaCharacters -> None, no strings have special meanings. MetaCharacters -> {c , c , c } specifies the metacharacters for pattern escape, single character matching and multiple character matching. MetaCharacters -> Automatic is equivalent to MetaCharacters -> {"\\", ".", "*"}.
 * Usage:                                                                                                                                              1   2   3
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
fun metaCharacters(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MetaCharacters", arguments.toMutableList(), options)
}
