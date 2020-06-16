package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             NetTrain
 *
 * Full name:        System`NetTrain
 *
 *                   NetTrain[net, {input   output , input   output , …}] trains the specified neural net by giving the input  as input and minimizing the discrepancy between the output  and the actual output of the net, using an automatically chosen loss function.
 *                                       1         1       2         2                                                         i                                                           i
 *                   NetTrain[net,  port   {data  , data  , …}, port   {…}, … ] trains the specified net by supplying training data at the specified ports.
 *                                       1        11      12          2
 *                   NetTrain[net, "dataset"] trains on a named dataset from the Wolfram Data Repository.
 *                   NetTrain[net, f] calls the function f during training to produce batches of training data.
 *                   NetTrain[net, data, "prop"] gives data associated with a specific property prop of the training session.
 * Usage:            NetTrain[net, data, All] gives a NetTrainResultsObject[…] that summarizes information about the training session.
 *
 *                   BatchSize -> Automatic
 *                   LearningRate -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   LossFunction -> Automatic
 *                   MaxTrainingRounds -> Automatic
 *                   Method -> Automatic
 *                   PerformanceGoal -> Automatic
 *                   RandomSeeding -> Inherited
 *                   TargetDevice -> CPU
 *                   TimeGoal -> Automatic
 *                   TrainingProgressCheckpointing -> None
 *                   TrainingProgressFunction -> None
 *                   TrainingProgressMeasurements -> Automatic
 *                   TrainingProgressReporting -> Automatic
 *                   TrainingStoppingCriterion -> None
 *                   TrainingUpdateSchedule -> Automatic
 *                   ValidationSet -> None
 * Options:          WorkingPrecision -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetTrain
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetTrain.html
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
fun netTrain(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetTrain", arguments.toMutableList(), options)
}
