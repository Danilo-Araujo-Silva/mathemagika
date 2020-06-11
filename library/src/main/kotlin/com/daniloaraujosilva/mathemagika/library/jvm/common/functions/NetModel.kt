package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetModel
 *
 * Full name:        System`NetModel
 *
 *                   NetModel["name"] obtains a neural net model with the specified name from the Neural Net Repository.
 *                   NetModel[{"name", param   setting , …}] obtains a specified model from a parameterized family of models.
 *                                          1          1
 *                   NetModel[model, "prop"] gives property prop of the model.
 * Usage:            NetModel[] gives a dataset of available pre-trained neural net models.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetModel.html
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
fun netModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetModel", arguments.toMutableList(), options)
}
