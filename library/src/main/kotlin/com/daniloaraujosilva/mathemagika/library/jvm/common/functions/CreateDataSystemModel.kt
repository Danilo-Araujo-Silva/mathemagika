package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateDataSystemModel
 *
 * Full name:        System`CreateDataSystemModel
 *
 *                   CreateDataSystemModel[{v , v , …}] creates a SystemModel generating a signal of values v .
 *                                           1   2                                                           i
 *                   CreateDataSystemModel[{{t , v }, …}] creates a model for the time-value pairs {t , v }.
 *                                            1   1                                                  i   i
 *                   CreateDataSystemModel[obj] creates a model for the TimeSeries or InterpolatingFunction obj.
 *                   CreateDataSystemModel[fun, tmin, tmax] creates a model with samples from the function fun between tmin and tmax.
 * Usage:            CreateDataSystemModel[data, "dspec"] creates a model with data specification "dspec".
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CreateDataSystemModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateDataSystemModel.html
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
 * Default value:    Options[CreateDataSystemModel] := SortBy[DeleteCases[Options[WSMLink`WSMCreateDataModelString], ("ExtendsComponent" -> _) | ("OutputDimension" -> _)], ToString[#1[[1]]] & ]
 *
 * Numeric values:   None
 */
fun createDataSystemModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateDataSystemModel", arguments.toMutableList(), options)
}
