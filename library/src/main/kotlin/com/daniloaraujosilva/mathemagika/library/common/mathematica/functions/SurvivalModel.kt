package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SurvivalModel
 *
 * Full name:        System`SurvivalModel
 *
 * Usage:            SurvivalModel[…] represents the symbolic survival model obtained from functions like SurvivalModelFit.
 *
 *                   ConfidenceLevel -> Automatic
 *                   ConfidenceRange -> Automatic
 * Options:          ConfidenceTransform -> Automatic
 *
 *                   HoldAll
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurvivalModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurvivalModel.html
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
fun survivalModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurvivalModel", arguments.toMutableList(), options)
}
