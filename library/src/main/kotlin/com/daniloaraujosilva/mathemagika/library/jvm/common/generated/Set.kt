package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Set
 * 
 * Full name:        System`Set
 * 
 *                   lhs = rhs evaluates rhs and assigns the result to be the value of lhs. From then on, lhs is replaced by rhs whenever it appears. 
 *                   {l , l , …} = {r , r , …} evaluates the r , and assigns the results to be the values of the corresponding l . 
 * Usage:              1   2         1   2                    i                                                                 i
 * 
 * Options:          None
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       SequenceHold
 * 
 *                   local: paclet:ref/Set
 * Documentation:    web: http://reference.wolfram.com/language/ref/Set.html
 * 
 * Definitions:      ((Devices`DeviceAPI`DeviceDump`dev_Symbol)[Devices`DeviceAPI`DeviceDump`prop__] = Devices`DeviceAPI`DeviceDump`rhs_) /; Devices`DeviceAPI`DeviceDump`devObjectHeadQ[Devices`DeviceAPI`DeviceDump`dev] := Devices`DeviceAPI`DeviceDump`setDevProp00["", Devices`DeviceAPI`DeviceDump`dev, Devices`DeviceAPI`DeviceDump`prop, Devices`DeviceAPI`DeviceDump`rhs]
 * 
 * Own values:       None
 * 
 * Down values:      ((Devices`DeviceAPI`DeviceDump`dev_Symbol)[Devices`DeviceAPI`DeviceDump`prop__] = Devices`DeviceAPI`DeviceDump`rhs_) /; Devices`DeviceAPI`DeviceDump`devObjectHeadQ[Devices`DeviceAPI`DeviceDump`dev] := Devices`DeviceAPI`DeviceDump`setDevProp00["", Devices`DeviceAPI`DeviceDump`dev, Devices`DeviceAPI`DeviceDump`prop, Devices`DeviceAPI`DeviceDump`rhs]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun `set`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Set", arguments.toMutableList(), options)
}
