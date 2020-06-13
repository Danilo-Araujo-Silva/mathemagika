package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             CharacterName
 *
 * Full name:        System`CharacterName
 *
 *                   CharacterName["c"] gives the name of the character c.
 *                   CharacterName[n] gives the name of the character with character code n.
 * Usage:            CharacterName[c, "type"] gives a name of the specified type.
 *
 * Options:          None
 *
 *                   Listable
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CharacterName
 * Documentation:    web: http://reference.wolfram.com/language/ref/CharacterName.html
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
fun characterName(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CharacterName", arguments.toMutableList(), options)
}
