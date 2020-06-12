package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             BabyMonsterGroupB
 *
 * Full name:        System`BabyMonsterGroupB
 *
 * Usage:            BabyMonsterGroupB[] represents the sporadic simple baby monster group B.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/BabyMonsterGroupB
 * Documentation:    web: http://reference.wolfram.com/language/ref/BabyMonsterGroupB.html
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
fun babyMonsterGroupB(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("BabyMonsterGroupB", arguments.toMutableList(), options)
}
