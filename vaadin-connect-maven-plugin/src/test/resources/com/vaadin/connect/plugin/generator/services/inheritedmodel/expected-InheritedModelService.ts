// @ts-ignore
import client from './connect-client.default';
import ChildModel from './com/vaadin/connect/plugin/generator/services/inheritedmodel/InheritedModelService/ChildModel';
import ParentModel from './com/vaadin/connect/plugin/generator/services/inheritedmodel/InheritedModelService/ParentModel';

export function getParentModel(
  child: ChildModel | null
): Promise<ParentModel | null> {
  return client.call('InheritedModelService', 'getParentModel', {child});
}
