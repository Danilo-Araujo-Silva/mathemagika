package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Dataset
 *
 * Full name:        System`Dataset
 *
 * Usage:            Dataset[data] represents a structured dataset based on a hierarchy of lists and associations.
 *
 *                   Alignment -> {Left, Baseline}
 *                   Background -> None
 *                   DatasetDisplayPanel -> {}
 *                   HeaderAlignment -> {Left, Baseline}
 *                   HeaderBackground -> Automatic
 *                   HeaderDisplayFunction -> Automatic
 *                   HeaderSize -> Automatic
 *                   HeaderStyle -> None
 *                   HiddenItems -> None
 *                   ItemDisplayFunction -> Automatic
 *                   ItemSize -> Automatic
 *                   ItemStyle -> None
 *                   MaxItems -> Automatic
 * Options:          ScrollPosition -> {1, 1}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Dataset
 * Documentation:    web: http://reference.wolfram.com/language/ref/Dataset.html
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
fun dataset(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Dataset", arguments.toMutableList(), options)
}
