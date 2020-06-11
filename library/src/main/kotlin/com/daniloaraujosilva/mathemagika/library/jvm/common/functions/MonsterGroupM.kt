package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MonsterGroupM
 *
 * Full name:        System`MonsterGroupM
 *
 * Usage:            MonsterGroupM[] represents the sporadic simple monster group M.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/MonsterGroupM
 * Documentation:    web: http://reference.wolfram.com/language/ref/MonsterGroupM.html
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
fun monsterGroupM(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MonsterGroupM", arguments.toMutableList(), options)
}
