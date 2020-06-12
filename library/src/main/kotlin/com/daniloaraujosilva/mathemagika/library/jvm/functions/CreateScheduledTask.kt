package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             CreateScheduledTask
 *
 * Full name:        System`CreateScheduledTask
 *
 *                   CreateScheduledTask[expr] creates a local scheduled task that will repeatedly evaluate expr once per second.
 *                   CreateScheduledTask[expr, time] creates a task that will repeatedly evaluate expr every time seconds.
 *                   CreateScheduledTask[expr, {time}] creates a task that will evaluate expr once after time seconds.
 *                   CreateScheduledTask[expr, {time, count}] creates a task that will try evaluating expr once every time seconds up to count times total.
 * Usage:            CreateScheduledTask[expr, timespec, start] creates a task that will evaluate expr according to timespec starting at start time.
 *
 *                   AutoRemove -> False
 *                   EpilogFunction :> Null
 * Options:          TaskGroup -> Global`
 *
 *                   HoldFirst
 * Attributes:       Protected
 *
 *                   local: paclet:ref/CreateScheduledTask
 * Documentation:    web: http://reference.wolfram.com/language/ref/CreateScheduledTask.html
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
fun createScheduledTask(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CreateScheduledTask", arguments.toMutableList(), options)
}
