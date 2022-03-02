<template>
  <Menu class="leftList" accordion>
    <Submenu v-for="itemOut in topList" :key="itemOut.id" :name="itemOut.id">
      <template slot="title">
        {{itemOut.value}}
      </template>
      <MenuItem v-for="item in topList" :key="item.id" :name="item.id">{{ item.id+"--"+item.value }}</MenuItem >
    </Submenu>
  </Menu>
</template>

<script>
export default {
  name: "LeftList",
  data() {
    return {
      topList:[
        {id: "0", value: "单词"},
        {id: "1", value: "单词"},
        {id: "2", value: "单词"},
        {id: "3", value: "单词"},
        {id: "4", value: "单词"},
      ]
    }
  }
}
</script>

<style scoped>
.leftList{
  height: 100%;
}
</style>