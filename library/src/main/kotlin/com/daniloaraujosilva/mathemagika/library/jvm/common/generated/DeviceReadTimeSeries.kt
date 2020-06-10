package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             DeviceReadTimeSeries
 * 
 * Full name:        System`DeviceReadTimeSeries
 * 
 *                   DeviceReadTimeSeries[device, {t, dt}] repeatedly reads default items from the specified device at interval dt for a total time t, returning a time series of the resulting values.
 *                   DeviceReadTimeSeries[device, {t, dt}, param] repeatedly reads the parameter param and returns a time series of its values.
 *                   DeviceReadTimeSeries[device, {t, dt}, {param , param , …}] repeatedly reads the param  and returns a time series of their values.
 * Usage:                                                        1       2                                i
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/DeviceReadTimeSeries
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeviceReadTimeSeries.html
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
fun deviceReadTimeSeries(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeviceReadTimeSeries", arguments.toMutableList(), options)
}
