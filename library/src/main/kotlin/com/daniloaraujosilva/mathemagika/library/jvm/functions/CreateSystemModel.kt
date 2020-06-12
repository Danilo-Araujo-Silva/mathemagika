package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateSystemModel
 *
 * Full name:        System`CreateSystemModel
 *
 *                   CreateSystemModel[sys] creates a Modelica SystemModel from the systems model sys.
 *                   CreateSystemModel[eqns, t] creates a model for the system equations eqns with independent variable t.
 *                   CreateSystemModel[…, tspec] creates a model with type specification tspec for variables and parameters.
 * Usage:            CreateSystemModel[…, spec] creates a model with spec for parameter values, initial values and model relations.
 *
 * Options:
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateSystemModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateSystemModel.html
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
fun createSystemModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateSystemModel", arguments.toMutableList(), options)
}
