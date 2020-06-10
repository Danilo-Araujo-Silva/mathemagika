package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             RunScheduledTask
 * 
 * Full name:        System`RunScheduledTask
 * 
 *                   RunScheduledTask[expr] schedules and starts a local scheduled task that will repeatedly evaluate expr once per second.
 *                   RunScheduledTask[expr, time] schedules and starts a task that will repeatedly evaluate expr every time seconds.
 *                   RunScheduledTask[expr, {time}] schedules and starts a task that will evaluate expr once after time seconds.
 *                   RunScheduledTask[expr, {time, count}] schedules and starts a task that will try evaluating expr once every time seconds up to count times.
 *                   RunScheduledTask[expr, timespec, start] schedules a task that will automatically start at start time.
 * Usage:            RunScheduledTask[CloudObject[…]] asynchronously executes an existing cloud task or document generator.
 * 
 *                   AutoRemove -> False
 *                   EpilogFunction :> Null
 * Options:          TaskGroup -> Global`
 * 
 *                   HoldFirst
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/RunScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/RunScheduledTask.html
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
fun runScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("RunScheduledTask", arguments.toMutableList(), options)
}
